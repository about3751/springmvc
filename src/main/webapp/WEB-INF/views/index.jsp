<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Index</title>
    <script type="text/javascript" src="../../js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#testAjax").click(function () {
            $.ajax({
                type:"POST",
                url:"main/testAjax",
                dataType:"json",
                contentType:"application/json;charset=UTF-8",
                data:JSON.stringify({
                    "data":[
                        {"name":"哈哈","age":"19"},
                        {"name":"呵呵","age":"22"}
                    ]
                }),
                success:function (data) {
                    alert(data.resultCode+" 成功 ");
                },
                error:function (errorMsg) {
                    alert(errorMsg);
                }
            });
            });

        })

    </script>
</head>
<body>
<a href="main/book"> Add New Person </a> <br/>
<a href="main/getBooks">Query All Books</a><br/>
<a href="main/getRelationships">Query All Relationships</a><br/>
<a href="main/getJSON">Test JSON</a><br/>
<a href="javaScript:void(0);" id="testAjax">Test Ajax</a>
</body>
</html>
