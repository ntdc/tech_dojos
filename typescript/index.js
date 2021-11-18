// 2001 is a typical common year
// 1996 is a typical leap year
// 1992 is a typical leap year
// 1900 is an atypical common year
// 2000 is an atypical leap year
// 
// All years not divisible by 4 are NOT leap years
// All years divisible by 4 but not by 100 ARE leap years 
// All years divisible by 100 but not by 400 are NOT leap years 
// All years divisible by 400 ARE leap years

function isLeapYear(annee){
  return isDivisibledByFour(annee) && !isDivisibledByOneHundred(annee); 
}

// Vérifie si l'année est divisible par 4
const isDivisibledByFour = (annee) => annee%4 === 0;

// Vérifie si l'année est divisible par 100
const isDivisibledByOneHundred = (annee) => annee%100 === 0;

module.exports = isLeapYear

