import React from "react";
import { Link } from "react-router-dom";

const Navbar: React.FC = () => {
  return (
    <nav className="fixed top-0 left-0 w-full flex items-center justify-between px-6 py-0 bg-white shadow-md">
      <img src="/logo_transparent.png" alt="Logo" className="h-12 w-auto" />

      <div className="flex items-center space-x-4">
        <Link to="/login" className="text-[#f1592a] hover:text-[#f1592a]">
          Login
        </Link>
        <Link
          to="/register"
          className="px-5 py-1  rounded-full border-1 border-[#f1592a] bg-white  hover:bg-[#f1592a] hover:text-white transition text-[#f1592a]"
        >
          Register
        </Link>
      </div>
    </nav>
  );
};

export default Navbar;
