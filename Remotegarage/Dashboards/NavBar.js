import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import "./Nav.css";
//import image from "../Images/logo.png";

export const NavBar = () => {
  return (
    <>
      <Navbar bg="primary" className="nav">
        <Container>
          <Navbar.Brand
            href="#home"
            className="name"
            style={{ color: "white", fontSize: "1rem", marginLeft: "20px" }}
          >
            Menu
          </Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="#home"></Nav.Link>
            <Nav.Link href="#features"></Nav.Link>
            <Nav.Link href="#pricing"></Nav.Link>
          </Nav>
        </Container>
      </Navbar>
    </>
  );
};
