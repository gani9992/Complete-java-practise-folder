
<html>
<head>
    
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%java.util.Date d=new java.util.Date();
    out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
    %>
<%= d.getHours()+":"+d.getMinutes()
    %>
</body>
</html>