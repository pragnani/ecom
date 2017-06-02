import {Component, OnInit} from "@angular/core";

@Component({
  selector: "home",
  templateUrl: "./app/Home/home.html"
})
export class HomeComponent implements OnInit {
  ngOnInit() {
    console.log("Home component initialized ...");
  }
}
