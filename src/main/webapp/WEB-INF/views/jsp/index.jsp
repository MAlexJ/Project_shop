<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Site">
    <meta name="MAlexJ" content="Site">

    <title>Spring Data JPA</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet"
          type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<jsp:include page="index_navbar.jsp" flush="true"/>

<div class="container" id="page-wrapper">
    <div class="container">
        <div class="row">
            <jsp:include page="home/home_product_catalog.jsp" flush="true"/>
            <div class="col-md-9">
                <jsp:include page="home/home_advertising.jsp" flush="true"/>
                <div class="row">
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                    <jsp:include page="home/home_product_preview.jsp" flush="true"/>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="index_footer.jsp" flush="true"/>


<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<!-- My Script JavaScript -->
<script src="${pageContext.request.contextPath}/resources/js/myjs.js"></script>

<!-- Morris Charts JavaScript -->
<script src="${pageContext.request.contextPath}/resources/js/plugins/morris/raphael.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/morris/morris.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/plugins/morris/morris-data.js"></script>
</body>
</html>
