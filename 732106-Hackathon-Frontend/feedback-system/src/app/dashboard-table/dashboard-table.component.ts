import { Component, OnInit } from '@angular/core';
import { RegisteredNotParticipatedService } from '../registered-not-participated.service';
import { RegisteredNotParticipated } from '../registered-not-participated';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-dashboard-table',
  templateUrl: './dashboard-table.component.html',
  styleUrls: ['./dashboard-table.component.css']
})
export class DashboardTableComponent implements OnInit {

  regnotpart: RegisteredNotParticipated[];

  settings = {
    actions: false, 
    columns: {
      initiator: {
        title: "event_id",
        type:'string',
        valuePrepareFunction: (cell,row) => {
        return row.id.event_id;
        }
        },
        id: {
          title: 'employee_id',
          type:'number',
          valuePrepareFunction: (id) => {
            return id.employee_id;
        },
      /*  filter: {
          type: 'custom',
          component: CustomFilterComponent
        } */
      },
      feedback: {
        title: 'feedback'
      },
      eventName: {
        title: 'Event Name'
      },
      beneficiaryName: {
        title: 'Beneficiary Name'
      },
      baseLocation: {
        title:'Base Location'
      },
      eventDate:{
        title:'Event Date'
      }
    },
    attr: {
      class: 'table table-bordered'
    }
  };

  constructor(private regnotpartService: RegisteredNotParticipatedService) { }
  
    ngOnInit() {
     this.regnotpartService.getRegnotPartData().subscribe((data: RegisteredNotParticipated[]) => {
       console.log("Data",data)
      this.regnotpart = data;
  
      
    });
  }
  
  
 

}
