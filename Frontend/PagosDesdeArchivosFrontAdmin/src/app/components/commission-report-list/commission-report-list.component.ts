import { Component, OnInit } from '@angular/core';

import { ReportEntity } from '../../models/ReportEntity';
import { CommissionReportService } from '../../services/commission-report-service/commission-report.service';

@Component({
  selector: 'app-commission-report-list',
  templateUrl: './commission-report-list.component.html',
  styleUrls: ['./commission-report-list.component.css']
})
export class CommissionReportListComponent implements OnInit {

  entities: ReportEntity[];

  constructor(private service: CommissionReportService) { }

  ngOnInit(): void {
    this.service.getReports().subscribe((res: ReportEntity[]) => {
      this.entities = res;
      console.log(res);
    }, err => {
      console.log(err);
    });
  }

}
