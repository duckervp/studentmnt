alert("OK");
const form1 = document.querySelector("form");
const checkboxes = document.querySelectorAll("input");

function getCheckedValue() {
  const checkedValues = [];
  checkboxes.forEach(c => {
    if (c.type == 'checkbox' && c.checked) {
      checkedValues.push(c.value);
    }
  });
  return checkedValues;
}

// form1.addEventListener("submit", e => {
//   e.preventDefault();
//   const majors = getCheckedValue();
//   const quantity = document.querySelector("#quantity").value;
//   if (majors.length != 0 || quantity != '') {
//     fetchTeacher(majors, quantity);
//   }
// }) ;

function fetchTeacher(majors, quantity) {
  console.log("fetch");
  let url = `http://localhost:8080/teachers?majors=${majors.join(",")}${quantity != '' ? '&quantity=' + quantity : ''}`;
  fetch(url, {
    method: 'GET'
  });
}