<%@ page import="com.guiaEscalada.model.Climber" %>
<jsp:include page="Header.jsp"/>
<div class="app-container">
    <nav class="navbar navbar-default" id="navbar">
        <div class="container-fluid">
            <div class="navbar-collapse collapse in">
                <ul class="nav navbar-nav navbar-mobile">
                    <li>
                        <button type="button" class="sidebar-toggle">
                            <i class="fa fa-bars"></i>
                        </button>
                    </li>
                    <li class="logo">
                        <a class="navbar-brand" href="#"><span class="highlight">Flat v3</span> Admin</a>
                    </li>
                    <li>
                        <button type="button" class="navbar-toggle">
                            <img class="profile-img" src="images/profile.png">
                        </button>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-left">
                    <li class="navbar-title">Profile</li>
                    <li class="navbar-search hidden-sm">
                        <input id="search" type="text" placeholder="Search..">
                        <button class="btn-search"><i class="fa fa-search"></i></button>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body app-heading">
                    <img class="profile-img" src="images/profile.png">
                    <div class="app-title">
                        <form action="/updateClimber" method="POST">
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">
                                    <i class="fa fa-user" aria-hidden="true"></i>
                                </span>
                                <input type="text" name="name" class="form-control" placeholder="Name" value="<% out.print(((Climber)request.getAttribute("user")).getName()); %>" required>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon3">
                                    <i class="fa fa-at" aria-hidden="true"></i>
                                </span>
                                <input type="text" name="email" class="form-control" placeholder="email" value="<% out.print(((Climber)request.getAttribute("user")).getEmail()); %>" required>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon4">
                                    <i class="fa fa-key" aria-hidden="true"></i>
                                </span>
                                <input type="password" name="password" class="form-control" placeholder="Password" value="<% out.print(((Climber)request.getAttribute("user")).getPassword()); %>" required>
                            </div>
                            <div class="text-center">
                                <input type="submit" class="btn btn-success btn-submit" value="Guardar">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="Footer.jsp" />