<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="col-md-3">
    <p class="lead">Каталог товаров</p>
    <div class="list-group">
        <c:forEach items="${product_catalog}" var="item">
            <a href="/catalog/<c:out value="${item.id}"/>" class="list-group-item"><c:out value="${item.pc_name}"/></a>
        </c:forEach>
    </div>
</div>