<!DOCTYPE html>
<html>
<header>
    <title>Patient Summary</title>
</header>
<body>
    <h1>Patient ${patient.id}</h1>
    <hr/>
    <p>BSN: ${patient.bsn}</p>
    <#assign patientName>${patient.lastName}</#assign>
    <p>Name: ${patientName}</p>
    <p>Birthdate: ${patient.birthDate}</p>
</body>
</html>