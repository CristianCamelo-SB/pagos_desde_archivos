import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CommissionReportFormComponent } from './commission-report-form.component';

describe('CommissionReportFormComponent', () => {
  let component: CommissionReportFormComponent;
  let fixture: ComponentFixture<CommissionReportFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CommissionReportFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CommissionReportFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
