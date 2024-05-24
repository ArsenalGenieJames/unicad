
//kani kay para dili mawala ang dropdown menu kung imo siya i hold mawala mana kani kay dili kailangan pa nimo siya tuplokon para mawala 
document.addEventListener('DOMContentLoaded', function() {
    var dropdownBtn = document.querySelector('.dropdown-btn');
    var dropdownContent = document.querySelector('.dropdown-content');

    dropdownBtn.addEventListener('click', function() {
        if (dropdownContent.style.display === 'block') {
            dropdownContent.style.display = 'none';
        } else {
            dropdownContent.style.display = 'block';
        }
    });
});

//date and time ni na js
function updateDateTime() {
            var currentDate = new Date();
            var dateTimeString = currentDate.toLocaleString();
            document.getElementById('datetime').innerText = dateTimeString;
        }


        updateDateTime();
        setInterval(updateDateTime, 1000);

//kani kay sa choices sa post kung ba siya announcement ba or confession
 var selectedValue = document.getElementById('announcementType').value;


 
