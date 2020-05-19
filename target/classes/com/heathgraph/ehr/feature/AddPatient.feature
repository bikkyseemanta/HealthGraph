Feature: Openweather automation

@Validate_Add_New_Patient
Scenario Outline: Validate add new patients through EHR
Given Run the URL to launch EHR application 
When user enter "<username>" and "<password>"
And click on login login button
Then EHR patient list page should display
And click on add pluse button
Then click on add new patient button
When user fill mandatory fields "<firstname>" "<mobno>"
Then user can create appointment
And open the created appointment in edit mode 
Then remove the mandatory fields and click on create appointment button
Then validate warning message should display 
Then fill patient details  "<firstname1>" "<mobno1>" "<middlename>" "<lastname>" "<secondaryno>" "<email>" "<language>" "<secondarylanguage>" "<pincode>" "<Add1>" "<Add2>" "<MedicalRepoNo>" "<Aadhaar>" "<PANno>" "<DLno>" "<patientref>" "<location>" "<SpeialistAvialable>" "<Doctor>" "<AppointmentType>" "<AppointmentCat>"   
Then user can create appointment                                                           
#And close the browser

Examples:
    | username        | password     |   firstname |   mobno   | firstname1|mobno1     |middlename | lastname | secondaryno |      email              | language | secondarylanguage | pincode | Add1  | Add2      | MedicalRepoNo | Aadhaar   | PANno    | DLno     | patientref  | location     | SpeialistAvialable | Doctor | AppointmentType | AppointmentCat |
    |   hgdummyrec    |  HGraph@2$2$ |    Sameer2   | 8912345678| Vicky     |9861929608 | kumar     | satapathy | 7751996482 | bswjttripathy@gmail.com | Hindi    | English           | 560037  | keruna| chatrapada| MRN123        |30965893118|ANMPT2557J|OR68310567|   self      | healthgraph | ophthalmology       |hg doc  | New             | free           |