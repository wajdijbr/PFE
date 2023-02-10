import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BienvComponent } from './bienv.component';

describe('BienvComponent', () => {
  let component: BienvComponent;
  let fixture: ComponentFixture<BienvComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BienvComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BienvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
