# JavaDocs Developer's Log

Project Description

JavaDocs is a user-friendly text editor that is simple yet gives many options with your text. You can change the color, font, format, etc. Once you finish messing around, you can save your file and load up another one or create a new one!


Directions

In the terminal, 'cd' to the JavaDocs directory. Once there, input 'javac Driver.java'. Once the files compile, simply input 'java Driver' and type away!


Bugs/Things to do

-Unfortunately, we could not save the formatting of the files. This is because we based our text editors on txt files, which essentially have no formatting. Perhaps we could have experimented with other file types so as to make our program more useful.

-Cannot change only a part of a text's format because of the nature of our functions. If we were to implement this, it would require switching our text to html, which would drastically change all of our functions. Also, initial testing with html proved to yield negative results.

-For some reason, fonts like Times New Roman and Comic Sans did not work on the school computers, but were fine on both home computers. Perhaps it is the difference between Java versions or Windows/Linux. For that reason, we have only included Times New Roman and Comic Sans as the fonts that might work. The rest are guaranteed to function properly. More fonts could have been easily included, but it would have been a waste if they did not function properly. Please take this into consideration when testing fonts.



1/19/2016

-Removed the Graphs button, taking the project in a new direction.

-No code done, just discussion of how our project has changed.

-Instead of graphs that display information about the text (and honestly, there's only so much to display), we will focus on perfecting the text editor itself. Word count and such can perhaps be an extra button.

-Things to work on next: 1. Fonts and format button can change only a highlighted portion of the text. 2. Word count and other info button. 3. Other general text editor stuff and making the GUI look better.

1/20/2016

-Made the interface larger.

-Switching to JEditorPane instead of JTextArea for easier formatting and such.

-Basic outline of getting selected text to change done, need to figure out how to change only the part they highlighted, as Strings do not have fonts.

1/21/2016

-Scrapping the partial formatting of selected text, will be worked on later.

-Word Count button added and mostly functional. Needs help with new lines without spaces but still have words.

-Things to work on next: 1. Perfect the Word Count. 2. Line count, Character Count, other counts. 3. Other To-Do stuff like vertical scroll functionality, prettier GUI, selecting a part of the text to format.

1/22/2016

-Word Count function reworked, I (Lawrence) had a brain fart and was using unnecessary code. Works for the most part, only bug is that new lines with words but no spaces count as a word.

-Finally found a way to implement scrolling correctly. Barebones scrolling, view is messed up.

1/23/2016

-Scrollbar now enabled. Text area should be fully functional with all the features included (except word count, which has only one slight bug, explained above).

-New GUI layout, includes rigid areas not shown.

-New bug: If you make the GUI window larger, then resize it smaller, the bounds of the text area increase and the horizontal scrollbar will appear. Purely visual, but still may need looking into.

1/24/2016

-New feature: Color button added, can change the color of the text to one of 12 choices.

-New feature: Font size button added, can change the size of the font to a number between 1 and 64, inclusive.

-Comments added to the code to make it more user friendly.

-Bug fix: Word Count function fully functional, no longer counts new lines as words.

1/25/2016

-Working on saving the format of the text so it can be loaded in the right format. ABANDONED

-Formatted the code better.
