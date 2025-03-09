import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { CandidateRegistrationComponent } from './components/candidate-registration/candidate-registration.component';
import { AboutComponent } from './components/about/about.component';
import { LoginComponent } from './services/login/login.component';
import { CreateJobComponent } from './components/create-job/create-job.component';

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'jobs', component: JobsComponent },
  { path: 'registration', component: CandidateRegistrationComponent },
  { path: 'about', component: AboutComponent },
  { path: 'login', component: LoginComponent },
  { path: 'create-job', component: CreateJobComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }