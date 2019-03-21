import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegisteredNotParticipatedComponent } from './registered-not-participated.component';

describe('RegisteredNotParticipatedComponent', () => {
  let component: RegisteredNotParticipatedComponent;
  let fixture: ComponentFixture<RegisteredNotParticipatedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegisteredNotParticipatedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegisteredNotParticipatedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
