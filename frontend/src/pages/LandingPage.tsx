import React from "react";
import TaskCompleterHero from '../components/TaskCompleterHero';
import Navbar from "../components/NavBar";

const LandingPage : React.FC = () => {
    return(
        <div>
            <Navbar/>
            <section className="relative flex justify-center top-[-9vh]">
                <TaskCompleterHero></TaskCompleterHero>
            </section>
        </div>
    )
}


export default LandingPage