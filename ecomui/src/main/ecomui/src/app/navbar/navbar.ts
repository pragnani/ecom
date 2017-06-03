import {Component, OnInit} from "@angular/core";

@Component({
  selector: "navbar",
  templateUrl: "./app/navbar/navbar.html"
})
export class NavBarComponent implements OnInit {
projectName:string ="Ecom";
  ngOnInit() {
    console.log("Navbar component initialized ...");
  }
}
