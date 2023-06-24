import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import "../Dashboards/Nav.css";
import image from "../Images/logo.png";

export const NavBar = () => {
  return (
    <>
      <Navbar bg="dark" className="nav">
        <Container>
          <Navbar.Brand href="#home" className="logo">
            <img src={image} className="logo"></img>
          </Navbar.Brand>
          <Navbar.Brand href="#home" className="name">
            Remote Garage
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
