@YoutubeLogin
Feature: Login successfully in the Youtube App
  I want to login in youtube App

	Scenario: Login with an account in youtube App
	Given I want to open the YoutubeApp
	When I login with username 'ddemostracion6@gmail.com' and password 'Passwordparamuestra1'
	Then I should see my name 'demostracion' in the profile section


