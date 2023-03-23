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

  frame("En nervcell i en hjärna"):
    image("../img/neuron", width = 0.85)
    p("Wikipedia: 'Nervcell'") 

  frame("En enkel modell av en hjärncell: en artificiell neuron"):
    image("../img/artificial-neuron", width = 0.85)
    code("output = S(x1*w1 + x2*w2 + x3*w3 + bias)") 
  
  frame("Ett litet nätverk av neuroner"):
    image("../img/ai-network", width = 0.95)
    p("Ett nätverk med 3 lager, 6 neuroner, 20 parametrar") 

  frame("Hur går träningen till?"):
    p("En enkel träningsalgoritm:")
    enumerate:
      p("Ge alla parametrar ett slumpmässigt startvärde.")
      p("Ge ny träningsdata som input.")
      p("Beräkna **felet**: ''avståndet'' mellan output och korrekt värde.")
      p("Välj en slumpmässig neuron och **justera** dess parametrar slumpmässigt; förändringsstorleken styrs av en *lärfaktor*.")
      p("Beräkna nya felet efter justeringen.")
      p("**Om** felet är mindre efter justering **så** behåll de nya parametrarna **annars** återställ parametrarna.")
      p("Upprepa från punkt 2 lagom många gånger.")
    p("Testa träningsalgoritmen här:")
    p("https://scastie.scala-lang.org/vVvDotCzRUyyAWg5lec9Jg")


  // Facebooks språkmodell LaMA:
  // 2048 GPU A100 80Gig VRAM (kostar 150kkr per GPU) i 21 dagar 10^12 ord, 65 10^9 
  frame("Vad skiljer vårt simpla nätverk från ChatGPT?"):
    p("Den simpla binära könsklassificeraren:")
    itemize:
      p("6 neuroner, 20 parametrar, tränad på 4 datapunkter")
    p("ChatGPT:")
    itemize:
      p("175 miljarder parametrar, tränad på **jättemycket** data \\\\(300 miljarder ord tränad med 10,000 specialdatorer)")
      p("Baserad på en **språkmodell** som tar ord som indata och ger troligaste efterföljande ord som utdata.")
      p("Vad betyder akronymen GPT?")
      itemize:
        p("**Generative**: Kan generera ny utdata medan den tar hänsyn till ett existerande sammanhang.")
        p("**Pre-trained**: Har i förväg tränats på jättestora textmängder, inkl. hela Wikipedia, och allmänt tillgängliga internet.")
        // Corpus CommonCrawl stod för 60% av indatan till GPT-3, Wikipedia 3% är 3 miljarder ord
        p("**Transformer**: Kan hantera sekvenser av ord, värdera kopplingar mellan ord och avgöra vilka ord som är viktigast.")

  frame("AI-forskare har förfinat träningen i många steg"):
    image("../img/chatgpt-steps", width = 1.05)
    p("https://openai.com/blog/chatgpt")

  frame("Några problem med maskininlärning"):
    p("Även om den verkar smart så förstår den ingenting!")
    space(1)
    enumerate:
      p("Bias: fördomsfull AI")
      p("Överträning: kan ej generalisera bortom träningsdata")
      p("Det är inte lätt att få stora modeller att bli bra")
      p("Kan plötsligt börja ''hallucinera'' -- spottar ur sig nonsens")
      p("Svårt att förhindra olämplig eller rent oacceptabel utdata")
      p("Kan inte själv avgöra vad som är rimligt")
      p("Är väldigt övertygande även när den har helt fel")
      p("Svårt att genomskåda hur nätverket fungerar: *explainability*")

  frame("När tar AI över?"):
    p("AI är redan här:")
    itemize:
      p("Bättre sökresultat, massövervakning, röstigenkänning, ...")
      p("Bättre diagnostik i sjukvården (hitta cancer).")
      p("Bättre på att undvika olyckor i trafiken.")
      p("AI som assistent. Skapa nya bilder från text, skriva kod, ...")
      p("Studenter försöker fuska på tentan med hjälp av ChatGPT.")
    p("Vad händer när fler områden tas över av AI?")
    itemize:
      p("Omstrukturering av arbetsmarknaden: försvinner mitt jobb?")
      p("Människans viktiga färdighet: att bli en skicklig prompter.")
      p("Hur ska vi förhindra illvillig användning av AI?")
      p("Vem har makten över AI? De stora dataföretagen? Staten?")
      p("Vad händer med demokratin? Vilket samhälle vill vi ha?")

  frame("Öppna AI-modeller tillgängliga för alla"):
    itemize:
      p("Hemlig AI kan ge konkurrensfördel")
      p("Öppen AI kan utvecklas snabbare i gemenskap")
      p("AI-modeller som öppen källkod blir samhällets infrastruktur")
    space(2)
    p("https://huggingface.co/models")
    space(1)
    p("Sök t.ex. efter modellen bart-large-mnli.")
    p("Vilken är huvudstaden i Skåne? Malmö, Lund, Stockholm")
      //https://huggingface.co/models
      //https://huggingface.co/facebook/bart-large-mnli?candidateLabels=malm%C3%B6%2C+lund%2C+stockholm&multiClass=false&text=Vilken+%C3%A4r+huvudstaden+i+sk%C3%A5ne%3F
    
  frame("AI och universitetsutbildning:"):
    p("Alla anställda och alla studenter behöver lära sig ...")
    itemize:
      p("att programmera")
      p("att förstå hur en AI funkar")
      p("att dra nytta av AI")
      p("att förhindra dålig användning av AI")
    p("Påverkan på lärande och examination:")
    itemize:
      p("Studenterna har rätt att få djupa kunskaper om:")
      itemize:
        p("hur man använder AI på ett bra sätt när man pluggar")
        p("hur man använder AI i den framtida yrkesrollen")
        p("begränsningar och risker med AI")
      p("Examination behöver i högre grad ske **muntligen**")
      p("Examination behöver ske på **högre kunskapsnivå**")
      p("Även examinera förmågan att **värdera utdata** från AI")
