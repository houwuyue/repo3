<%--
  Created by IntelliJ IDEA.
  User: HWY
  Date: 2020/1/9
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>资讯</title>
    <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
    <link rel="stylesheet" href="css/bootstrap.css">

</head>
<body onload="f()">
<div style="width: 82%;height:80%;position: absolute;top: 30px;left: 10%">
    <div class="input-group">
        <input style="width: 500px;margin-left: 250px;" type="text" class="form-control" placeholder="输入关键字查询">

        <button class="btn btn-default" type="button">Go!</button>

    </div>
    <script type="text/javascript">
        function f() {
            $.ajax({
                type:"POST",
                url:"servlet.mvc/getalldata.mvc",
                success:function (data) {
                    $("#myTable tr:not(:first)").empty("");
                    var jsData = data;
                    for (var i=0;i<jsData.list.length;i++){
                        var $myTable  = $("#myTable");
                        var $tr = $myTable[0].insertRow();

                        var $ts_middle_pk = $tr.insertCell(0);
                        var $depart_time = $tr.insertCell(1);
                        var $travel_agency_pk = $tr.insertCell(2);
                        var $price = $tr.insertCell(3);
                        var $count = $tr.insertCell(4);
                        var $over_time = $tr.insertCell(5);
                        var $details = $tr.insertCell(6);
                        var $buttons = $tr.insertCell(7);

                        $ts_middle_pk.innerText = jsData.list[i].ts_middle_pk;
                        $depart_time.innerText = jsData.list[i].depart_time;
                        $travel_agency_pk.innerText = jsData.list[i].travel_agency_pk;
                        $price.innerText = jsData.list[i].price;
                        $count.innerText = jsData.list[i].count;
                        $over_time.innerText = jsData.list[i].over_time;
                        $details.innerText = jsData.list[i].details;
                        var $button = $(`<button class="start" onclick ="window.location.href = 'TouristInformation.html'"/></button>`);
                        $button.text("报名");
                        $buttons.appendChild($button.get(0));

                    }

                }
            })
        }
    </script>
    <table id="myTable" class="table table-hover">
        <tr>
            <td>序号</td>
            <td>出团日期</td>
            <td>团期编号</td>
            <td>单价</td>
            <td>预收人数</td>
            <td>结束时间</td>
            <td>详细</td>
            <td>报名</td>
        </tr>
    </table>
    <nav aria-label="Page navigation">
      <ul id="ul" class="pagination">
        <li>
          <a href="/servlet.mvc/get_data.mvc.mvc?page=${pageInfo.pageNum-1}" aria-label="Previous">
            <span aria-hidden="true">&laquo;</span>
          </a>
        </li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><span onclick="">5</span></li>
        <li>
          <a href="#" aria-label="Next">
            <span aria-hidden="true">&raquo;</span>
          </a>
        </li>
      </ul>
    </nav>
</div>

</body>
</html>
