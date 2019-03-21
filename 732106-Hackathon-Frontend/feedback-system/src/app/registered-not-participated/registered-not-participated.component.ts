import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { RegisteredNotParticipated } from '../registered-not-participated';
import { RegisteredNotParticipatedService } from '../registered-not-participated.service';

@Component({
  selector: 'app-registered-not-participated',
  templateUrl: './registered-not-participated.component.html',
  styleUrls: ['./registered-not-participated.component.css']
})

   
export class RegisteredNotParticipatedComponent implements OnInit {

  regnotpart: RegisteredNotParticipated = new RegisteredNotParticipated();
  submitted = false;

  constructor(private regnotpartService: RegisteredNotParticipatedService,
    private route: ActivatedRoute) { }

  ngOnInit() {
    const firstParam: string = this.route.snapshot.queryParamMap.get('firstParamKey');
    console.log("firstParam",firstParam);
    this.regnotpart.eventID=firstParam;
    const secondParam: string = this.route.snapshot.queryParamMap.get('secondParamKey');
    console.log("secondParam",secondParam);
    this.regnotpart.empID=Number(secondParam);
  }

  newRegisteredNotParticipated(): void {
    this.submitted = false;
    this.regnotpart = new RegisteredNotParticipated();
  }

  save() {
    
    this.regnotpartService.update(this.regnotpart.eventID,this.regnotpart.empID,{
      feedback: this.regnotpart.feedback
    })
      .subscribe(data => console.log(data), error => console.log(error));
    this.regnotpart = new RegisteredNotParticipated();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  
}
