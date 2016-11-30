// JS File for the website

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
    console.log($("#bg").height());
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
