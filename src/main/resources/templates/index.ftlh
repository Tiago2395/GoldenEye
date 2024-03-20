<!DOCTYPE html>  
<html lang="en">  
    <head>
        <meta charset="UTF-8">
        <title>GoldenEye email generator</title>
        <link rel="stylesheet" type="text/css" href="/styles.css">
    </head>
    <body>
        <div class="container">
            <h1>GoldenEye Employee Email generator</h1>
            <form action="/formProcess" method="post">
                <div class="data">
                    <label for="name">Name:</label>
                    <input id="name" name="name" pattern="[A-Za-z ]+" required />
                </div>
                <div class="data">
                    <label for="surname">Surname:</label>
                    <input id="surname" name="surname" pattern="[A-Za-z ]+" required />
                </div>

                <div class="data">
                    <label for="location">Office location:</label>
                    <select id="location" name="location" required>
                        <option value="empty" selected disabled>-- Select your office location --</option>
                        <option value="milan">Milan</option>
                        <option value="spain">Spain</option>
                        <option value="new-york">New York</option>
                    </select>
                </div>

                <div class="data">
                    <label for="department">Department:</label>
                    <select id="department" name="department" disabled required>
                        <option value="empty" selected disabled>-- Select your department --</option>
                        <option value="design" disabled>Design</option>
                        <option value="business">Business</option>
                        <option value="advertising" disabled>Advertising</option>
                        <option value="research-and-development" disabled>Research & development</option>
                    </select>
                </div>

                <div class="btn-container">
                    <input type="submit" value="Submit" id="submit" />
                </div>
            </form>
        </div>
    </body>

    <script src="script.js" type="text/javascript"></script>
</html>