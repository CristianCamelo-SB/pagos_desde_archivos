import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfigureEntitiesFormComponent } from './configure-entities-form.component';

describe('ConfigureEntitiesFormComponent', () => {
  let component: ConfigureEntitiesFormComponent;
  let fixture: ComponentFixture<ConfigureEntitiesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfigureEntitiesFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfigureEntitiesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
