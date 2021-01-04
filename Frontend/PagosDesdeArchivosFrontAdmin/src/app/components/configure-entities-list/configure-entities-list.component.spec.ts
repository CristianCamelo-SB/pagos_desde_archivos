import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfigureEntitiesListComponent } from './configure-entities-list.component';

describe('ConfigureEntitiesListComponent', () => {
  let component: ConfigureEntitiesListComponent;
  let fixture: ComponentFixture<ConfigureEntitiesListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConfigureEntitiesListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConfigureEntitiesListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
