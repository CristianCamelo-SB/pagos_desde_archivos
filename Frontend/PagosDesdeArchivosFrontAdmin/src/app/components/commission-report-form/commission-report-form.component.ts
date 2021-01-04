import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { ReportEntity } from 'src/app/models/ReportEntity';
import { CommissionReportService } from 'src/app/services/commission-report-service/commission-report.service';

@Component({
  selector: 'app-commission-report-form',
  templateUrl: './commission-report-form.component.html',
  styleUrls: ['./commission-report-form.component.css']
})
export class CommissionReportFormComponent implements OnInit {

  entity: ReportEntity = {
                              id: 0,
                              nit: '',
                              name: '',
                              address: '',
                              payment: 0
                            };

  constructor(private activedRoute: ActivatedRoute, private service: CommissionReportService) { }

  ngOnInit(): void {
    const params = this.activedRoute.snapshot.params;
    if (params.id) {
      this.service.getReportById(params.id).subscribe((res: ReportEntity) => {
        this.entity = res;
      }, err => {
        console.log(err);
      });
    }
  }

}
