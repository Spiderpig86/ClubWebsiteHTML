// JS File for the website
var mobileMenuHidden = true;

if ($("#bg").height() > 650) {
  // Function to make the landing div the same height as the window using jQuery
  $("#landing").css({
      'height' : $("#bg").height() // Sets the minimum height of the div as the browser height.
  })
}

  $(window).on('resize', function() { // Make sure the window height updates along with the browser
      if ($("#bg").height() > 650) {
        //console.log($("#bg").height());
        $("#landing").css({
          'height' : $("#bg").height()
      })
    }
    // Hides the mobile menu if the width is greater than 768px.
    if ($("#bg").width() > 768) {
      updateMobileMenu(true);
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
function updateMobileMenu(hide) {
    mobileMenuHidden = hide;
    if (hide) { // Show the menu
      $("#dropDownMenuContainer").css("height", "0");
             /*$("#hamburgerButton i").removeClass("fa fa-times");
             $("#hamburgerButton i").addClass("fa fa-bars");*/
             $("#dropDownMenuContainer").css("box-shadow", "0 0 0 rgba(0, 0, 0, 0.12), 3px 4px 8px 0px rgba(0, 0, 0, 0.11)");
               $("#hamburgerButton").removeClass("in-menu");
                $("#menuList").css("box-shadow:", "none")
         } else {
           $("#hamburgerButton").addClass("in-menu");
             $("#dropDownMenuContainer").css("height", "100%");
             /*$("#hamburgerButton i").removeClass("fa fa-bars");
              $("#hamburgerButton i").addClass("fa fa-times");*/
             $("#dropDownMenuContainer").css("box-shadow", "none");
             $("#menuList").css("box-shadow:", "rgba(0,0,0,0.3) 0 0 10px;")
           }
}

// For the hamburger menu
$("#hamburgerButton").click(function() {
    updateMobileMenu(!mobileMenuHidden);
});

// Hide the drop
