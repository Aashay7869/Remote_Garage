import React from "react";
import "../Dashboards/Footer.css";

export const Footer = () => {
  return (
    <>
      <Footer bgColor="light" className="text-center text-lg-left">
        <div
          className="text-center p-3"
          style={{ backgroundColor: "rgba(0, 0, 0, 0.2)" }}
        >
          &copy; {new Date().getFullYear()} Copyright:{" "}
          <a className="text-dark" href="https://mdbootstrap.com/">
            MDBootstrap.com
          </a>
        </div>
      </Footer>
    </>
  );
};
