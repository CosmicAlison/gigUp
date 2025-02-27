import React from 'react';
import { Link } from "react-router-dom";

const TaskCompleterHero: React.FC = () => {
  return (
    <div className="relative grid grid-cols-2 w-[80vw] h-[55vh] bg-[#590168] rounded-[60px] mx-auto mt-0 items-center px-10">
      <div className="text-white justify-left">
        <p className="text-3xl font-bold mb-10">
          Earn some extra income while helping members of your community.
        </p>
        <Link
          to="/register"
          className="px-5 py-2 rounded-full border-2 border-[#f1592a] bg-transparent hover:bg-[#f1592a] hover:text-white transition text-[#f1592a]"
        >
          Start Earning
        </Link>
      </div>

      <div className="relative flex justify-center">
        <img
          src="/girl-typing.png"
          alt="Girl Typing"
          className="w-[25vw] h-auto"
        />
      </div>
    </div>
  );
}

export default TaskCompleterHero;
