function validateForm() {
    var firstName = document.forms["surveyForm"]["firstName"].value;
    var lastName = document.forms["surveyForm"]["lastName"].value;
    var dob = document.forms["surveyForm"]["dob"].value;
    var country = document.forms["surveyForm"]["country"].value;
    var gender = document.forms["surveyForm"]["gender"].value;
    var profession = document.forms["surveyForm"]["profession"].value;
    var email = document.forms["surveyForm"]["email"].value;
    var mobileNumber = document.forms["surveyForm"]["mobileNumber"].value;

    if (firstName == "" || lastName == "" || dob == "" || country == "" || gender == "" || profession == "" || email == "" || mobileNumber == "") {
        alert("All fields must be filled out");
        return false;
    }

    const currentDate = new Date().toISOString().split('T')[0];
    if(dob.min != currentDate){
        alert("Date Of Birth should be past")
        return false;
    }

    var emailRegex = /\S+@\S+\.\S+/;
    if (!emailRegex.test(email)) {
        alert("Invalid email format");
        return false;
    }

    var mobileNumberRegex = /^\d{10}$/;
    if (!mobileNumberRegex.test(mobileNumber)) {
        alert("Invalid mobile number format");
        return false;
    }


    var values = {
        "First Name": firstName,
        "Last Name": lastName,
        "Date of Birth": dob,
        "Country": country,
        "Gender": gender,
        "Profession": profession,
        "Email": email,
        "Mobile Number": mobileNumber
    };

    var result = "";
    for (var key in values) {
        result += key + ": " + values[key] + "\n";
    }

    alert(result);
    resetForm();
    return false;
}

function resetForm() {
    document.forms["surveyForm"].reset();
}