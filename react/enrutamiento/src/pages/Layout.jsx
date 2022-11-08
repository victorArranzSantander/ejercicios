import React from "react";
import { Outlet, Link } from 'react-router-dom';
import "../estilos/Layout.css";


function Layout(){
    // https://stackoverflow.com/questions/48497510/simple-conditional-routing-in-reactjs
    return(
        <>
            <nav className="navbar navbar-expand-sm">
                <div className="container-fluid">
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav">
                        <li className="nav-item">
                            <Link className="nav-link" to = "/">Home</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to = "/Blogs">Blogs</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to = "/Contact">Contact</Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to = "/*">NoPage</Link>
                        </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <Outlet />
        </>
    )
}

export default Layout;