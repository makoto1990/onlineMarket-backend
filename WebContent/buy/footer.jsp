<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8" %>
<hr />
<footer class="text-center">
    <p>&copy;
        <lable id="current"></lable> 支农网上生鲜超市</p>
</footer>
<script>
    var year = new Date().getFullYear();
    document.getElementById("current").innerHTML = " " + year;
</script>