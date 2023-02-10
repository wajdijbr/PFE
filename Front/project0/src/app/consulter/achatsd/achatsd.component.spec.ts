import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AchatsdComponent } from './achatsd.component';

describe('AchatsdComponent', () => {
  let component: AchatsdComponent;
  let fixture: ComponentFixture<AchatsdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AchatsdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AchatsdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
