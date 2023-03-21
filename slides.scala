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
    p("1995 är fel och bara ca 5 av ca 100 artiklar inom testning")
    p("https://cs.lth.se/bjorn-regnell")

  frame("Hallå ChatGPT..."):
    image("../img/chatgpt-error", width = 1.05)
    space(2)
    p("Man kan inte få allt...")
    space(2)

  frame("Hur funkar en AI?"):
    p("Exempel på ett riktigt simpelt neuralt nätverk:")
    itemize:
      p("https://github.com/bjornregnell/scai")
    p("En fördomsfull binär klassificerare av kön givet längd och vikt.")
    space(2)
    p("Träningsdata:")
    p("115, 66 : 1      \\hfill Female")
    p("175, 78 : 0      \\hfill Male")
    p("205, 72 : 0      \\hfill Male")
    p("120, 67 : 1      \\hfill Female")
    space(2)
    p("Testdata:")
    p("167, 73  \\hfill borde bli 0")
    p("120, 72  \\hfill borde bli 1")


  frame("Vad skiljer detta simpla nätverk från dagens bästa AI?"):
    p("Min simpla binära könsklassificerare:")
    itemize:
      p("6 neuroner, 20 parametrar, tränad på 4 datapunkter")
    p("ChatGPT version 3:")
    itemize:
      p("Över 100 miljoner parametrar, tränad på **jättemycket** data")
      p("En **språkmodell** som kan ta ord uppdelade i sina beståndsdelar som indata och ge ord som utdata")
      p("GPT")
      itemize:
        p("**Generative**: Kan generera ny utdata medan den tar hänsyn till ett existerande sammanhang.")
        p("**Pre-trained**: Har i förväg tränats på jättestora textmängder, inkl. hela Wikipedia, en massa böcker etc.")
        p("**Transformer**: Kan hantera sekvenser av ord och värdera vad som är viktigast.")

  frame("AI-forskare har förfinat detta i många steg"):
    image("../img/transformer-architecture", width = 0.75)
    p("Wikipedia: 'Transformer (machine learning model)'")


  frame("När tar AI över?"):
    p("AI är redan här:")
    itemize:
      p("Bättre sökresultat och massövervakning.")
      p("Bättre canceridentifiering.")
      p("Bättre på att undvika olyckor i trafiken.")
      p("Studenter försöker fuska på tentan med hjälp av ChatGPT.")
      p("...")
    p("Vad händer när fler områden tas över av AI?")
    itemize:
      p("Omstrukturering av arbetsmarknaden: försvinner mitt jobb?")
      p("Människans viktiga färdighet: att bli en skicklig prompter.")
      p("Hur ska vi förhindra illvillig användning av AI?")
      p("Vem har makten över AI? De stora dataföretagen? Staten?")
      p("Vad händer med demokratin?")
      p("Vilket samhälle vill vi leva i?")

  frame("AI och LTH:"):
    p("Alla anställda och alla blivande ingenjörer behöver lära sig ...")
    itemize:
      p("att programmera")
      p("att förstå hur en AI funkar")
      p("att dra nytta av AI")
      p("att förhindra dålig användning av AI")
    p("Påverkan på lärande och examination:")
    itemize:
      p("Studenterna har rätt att få djupa kunskaper om hur man:")
      itemize:
        p("använder AI på ett bra sätt när man pluggar")
        p("använder AI i den framtida yrkesrollen")
      p("Examination sker i högre grad muntligen")
      p("Examination sker i högre grad på förståelsenivå")
