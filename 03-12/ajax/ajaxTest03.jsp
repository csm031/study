<%@ page import="java.util.Objects" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    String name = request.getParameter("name");
    if (Objects.equals(name, "최승문")){
%>
    <p>안녕 최승문!</p>
<%
}else{
%>
    <p>잘못 입력하셨습니다</p>
<%
    }
%>