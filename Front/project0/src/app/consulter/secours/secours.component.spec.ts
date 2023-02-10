import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecoursComponent } from './secours.component';

describe('SecoursComponent', () => {
  let component: SecoursComponent;
  let fixture: ComponentFixture<SecoursComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecoursComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SecoursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
