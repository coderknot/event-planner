# Event Planner

#### A command line application for an event planning service, Current Version: 03/17/2017

#### Author: John Carr

## Description
A JAVA command line interface (CLI) application for an event planning service. This program allows the customer to create a new event in the system, storing number of guests, food choices, beverage choices, and entertainment options based on the customer's decisions. Coupons may also be applied to events, granting the customer a discounted cost!

## Setup/Installation Instructions

* Clone portfolio respository from:
<http://github.com/coderknot/event-planner>
* Compile App.java in event-planner/src/main/java/App.java
* Run App.class in CLI
* Follow Event Planner prompts

## Specifications

| Behavior | Example Input | Example Output |
|----------|---------------|----------------|
|The program should instatiate an Event object | (no object) | Event |
|The program should receive and store the event's the number of guests | Number of Guests: 10 | Number of Guests: 10 |
|The program should receive and store the user's food choice | Food Choice: "Light Snack" | Food Choice: "Light Snack" |
|The program should receive and store the user's beverage choice | Beverage Choice: "Water, Juice, and Soda" | Beverage Choice: "Water, Juice, and Soda" |
|The program should receive and store the user's entertainment choice | Entertainment Choice: Live Band | Entertainment Choice: Live Band |
|The program should receive and store the user's coupon codes | Coupon Code: "10-OFF-100" | Coupon Code: "10-OFF-100" |
|The program should calculate the cost of the event based on the event details | new Event(10, 1, 1, 1, emptyStringArray[]) | Event Cost: 130 |
|The program should apply discount from single coupon code for calculating event cost | new Event(10, 1, 1, 1, {"10-OFF-100"}) | Total Discount: 10 |
|The program should apply discount from multiple coupon codes for calculating event cost | new Event(10, 1, 1, 1, {"10-OFF-100","5-OFF-150"}) | Total Discount: 15 |
|The program should apply the total discount from coupons to the event cost | new Event(10, 1, 1, 1, {"10-OFF-100","5-OFF-150"}) | Event Cost: 115 |

## Known Bugs
No known bugs.

## Support and contact details
Questions? Concerns? Suggestions?

Reach out to me via github:
<http://github.com/coderknot>

## Technologies Used
* _JAVA_
* _JUnit_
* _Gradle_

## License

MIT License

Copyright (c) 2017 John Carr

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
