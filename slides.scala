//> using lib "taggy:taggy:0.0.5,url=https://github.com/bjornregnell/taggy/releases/download/v0.0.5/taggy_3-0.0.5.jar"
//> using scala "3.3.0-RC3"

import taggy.*

@main def makeSlides = slides.toPdf(out = "AI-taking-over", dir = "tex")

def slides = document("När AI tar över"):
  frame("Björn Regnell enligt ChatGPT"):
    p("""
      Björn Regnell är professor i mjukvaruteknik vid Lunds universitet i Sverige.
      Han har arbetat på universitetet sedan *1995* och är en känd expert inom kravteknik, 
      *mjukvarutestning* och förbättring av mjukvaruprocesser. Han har publicerat mycket 
      inom sitt område och har mottagit flera priser för sina forskningsinsatser.""")
    space(4)
    p("https://cs.lth.se/bjorn-regnell")

  frame("Hallå ChatGPT..."):
    image("../img/chatgpt-error", width = 1.05)
    space(2)
    p("Man kan inte få allt...")
    space(2)
