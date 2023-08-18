import "../Login/Login.css";
import logo from "../Images/logob.png";

export const Login = () => {
  return (
    <>
      <div className="container-fluid p-0">
        <div className="row">
          <div className="col-8 col-sm-8 col-md-8 col-xl-8 c1 "></div>

          <div className="col-4 col-sm-4 col-md-4 col-xl-4 c2 d-flex flex-column align-items-center justify-content-around">
            {/* <p className=" text-center ">LOGIN</p> */}

            <img src={logo} className="img-fluid  logo " alt="logo"></img>

            <form action="/action_page.php" className="Form">
              <div class="w-75 m-0">
                <lable className="from-label"> User Name : </lable>
                <input
                  type="text"
                  class=" form-control box mt-2"
                  id="email"
                  placeholder="Enter Username"
                  name="email"
                />
              </div>
              <div class="w-75 m-0">
                <lable className="from-label "> Password : </lable>
                <input
                  type="password"
                  class="form-control box mt-2"
                  id="pwd"
                  placeholder="Enter password"
                  name="pswd"
                />
              </div>

              <button type="submit" class="btn m-0 login d-grid mx-auto">
                LOGIN
              </button>
            </form>

            <div className="w-75 mt-2 d-flex justify-content-around flex-wrap  ">
              <div>
                <a
                  href=""
                  className="text-decoration-none"
                  style={{ fontSize: ".8em", color: "white" }}
                >
                  <label className="link">Forgot Password</label>
                </a>
              </div>
              <br></br>
              <div>
                <a
                  href=""
                  className="link text-decoration-none"
                  style={{ fontSize: ".8em", color: "white" }}
                >
                  <label className="link">Register</label>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};
