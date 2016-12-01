// JS File for the website
var mobileMenuShown = true;

if ($("#bg").height() > 650) {
  // Function to make the landing div the same height as the window using jQuery
  $("#landing").css({
      'height' : $("#bg").height() // Sets the minimum height of the div as the browser height.
  })
}

  $(window).on('resize', function() { // Make sure the window height updates along with the browser
      if ($("#bg").height() > 650) {
        $("#landing").css({
          'height' : $("#bg").height()
      })
    }
    // Hides the mobile menu if the width is greater than 768px.
    if ($("#bg").width() > 768) {
      updateMobileMenu(false);
    }
  })


// Drop the website menu down when the user scrolls past the landing div

$(window).scroll(function() {
  if ($(window).scrollTop() < $("#landing").height()) {
    $('ul#menuList').addClass('hidden');
      //updateMobileMenu(true);
  } else {
    $('ul#menuList').removeClass('hidden');
  }
});

// Shows/Hides the hamburger button in the menu based on the screen width.
function updateMobileMenu(show) {
    mobileMenuShown = show;
    if (show) { // Show the menu

    } else {  // Hide the menu

    }
}
