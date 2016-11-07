// JS File for the website

// Function to make the landing div the same height as the window using jQuery
$("#landing").css({
    'min-height' : $(window).height() // Sets the minimum height of the div as the browser height.
})

$(window).on('resize', function() { // Make sure the window height updates along with the browser
    $("#landing").css({
        'height' : $(window).height()
    })
})

// Drop the website menu down when the user scrolls past the landing div

$(window).scroll(function() {
    if ($(document).scrollTop() < $(window).height()) {
        $('#topMenu').addClass('hidden');
        //updateMobileMenu(true);
    } else {
        $('#topMenu').removeClass('hidden');
    }
});
