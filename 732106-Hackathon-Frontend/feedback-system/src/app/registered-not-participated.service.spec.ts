import { TestBed, inject } from '@angular/core/testing';

import { RegisteredNotParticipatedService } from './registered-not-participated.service';

describe('RegisteredNotParticipatedService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RegisteredNotParticipatedService]
    });
  });

  it('should be created', inject([RegisteredNotParticipatedService], (service: RegisteredNotParticipatedService) => {
    expect(service).toBeTruthy();
  }));
});
