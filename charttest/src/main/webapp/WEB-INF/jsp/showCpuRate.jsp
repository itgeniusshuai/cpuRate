<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/Highcharts/js/highcharts.js"></script>
</head>
<body>
	welect to chart;
	<input type="hidden" id="ipHidden" value="${ip }">
	<div id="cpuRate" style="weight:800;height:400;margin:20 auto;"></div>
</body>
<script type="text/javascript">
var json = {};
$(document).ready(function() {
   var times;
   var ip;
   var title = {
      text: 'CpuUsedRate'   
   };
   var subtitle = {
      text: 'Source: runoob.com'
   };
   var xAxis = {
      categories: times
   };
   var yAxis = {
      title: {
         text: 'Temperature (\xB0C)'
      },
      plotLines: [{
         value: 0,
         width: 1,
         color: '#808080'
      }]
   };   

   var tooltip = {
      valueSuffix: '\xB0C'
   }

   var legend = {
      layout: 'vertical',
      align: 'right',
      verticalAlign: 'middle',
      borderWidth: 0
   };

   var series =  [
      /* {
         name: 'Tokyo',
         data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2,
            26.5, 23.3, 18.3, 13.9, 9.6]
      }, 
      {
         name: 'New York',
         data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8,
            24.1, 20.1, 14.1, 8.6, 2.5]
      },
      {
         name: 'London',
         data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0, 
            16.6, 14.2, 10.3, 6.6, 4.8]
      } */
   ];

   

   json.title = title;
   json.subtitle = subtitle;
   json.xAxis = xAxis;
   json.yAxis = yAxis;
   json.tooltip = tooltip;
   json.legend = legend;
   json.series = series;

   $('#cpuRate').highcharts(json);
});

	$(function(){
		flushData();
	});
	function flushData(){
		setInterval(getData(),1000);
	}
	function getData(){
		var ip=$("#ipHidden").val();
		$.ajax({
			type: "post",
		      url: "${pageContext.request.contextPath}/server/queryRate",
		      data:{"ip":ip},
		      dataType: "json",
		      success : function(data){
		    	  alert(data.times);
		     	var times=data.times;
		     	var datas=data.datas;
		     	json.xAxis = times;
		     	json.yAxis = datas;
		      }
			
		});
		
	}

</script>

</html>