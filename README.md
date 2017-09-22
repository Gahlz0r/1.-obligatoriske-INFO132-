# 1.-obligatoriske-INFO132-
Dette er den første obligatoriske oppgaven utlevert på emnet INFO132 - Grunnkurs i programmering ved UiB

Oppgaveteksten var følgende: 

INFO132 Grunnkurs i programmering
Obligatorisk innlevering 1
Innleveringsfrist: 18. september, 15:00

Oppgaven skal dokumentere grunnleggende ferdigheter og kunnskap om objekt- og klassedefinisjoner,
og er delt i to:
• I første del beskrives to klasser som dere skal implementere selv,
• i andre del skal dere gjøre rede for noen sentrale begreper.

1 Klassedefinisjoner
I denne oppgaven skal dere implementere to klasser: Person og Message. Dere skal opprette begge
klassene i et nytt prosjekt i BlueJ.
Alle klassenavn, variabler og metoder navngis på engelsk. Klassen Person skal inneholde to private
felt: name av type String og isOnline av type boolean. Klassen Message skal ha to felt: messageBody
av type String og sender av type Person.
Legg merke til at klassen Message er avhengig av klassen Person. For at BlueJ skal forstå typen
Person når du implementerer klassen Message, må du allerede ha opprettet den klassen når du oppretter
Message. Som vi skal se i oppgave 1.c) vil også Person kjenne til klassen Message.

1.a) Klassen Person skal ha en konstruktør som tar én parameter: personens navn. Navnet skal ikke
kunne endres, s dere skal ikke lage setter -metode for den. Feltet isOnline skal ha både getter
og setter slik vi har diskutert på forelesning, og skal settes til false i konstruktøren.

1.b) Klassen Message skal ha en konstruktør som tar to parametre
1. første parameter er sender av type Person, og
2. andre parameter er messageBody av type String.
Begge disse parametrene skal sette verdien til de tilsvarende feltene. Merk at siden feltene har
samme navn som parametrene, m˚a du bruke nøkkelordet this i tilordningen.
Klassen skal ha getters for begge feltene, men ingen setters.

1.c) Klassen Person skal ha en metode receiveMessage, med følgende signatur:
public void receiveMessage(Message message)
Metoden skal skrive ut til terminalen (se eksempel til høyre):
• En linje som begynner med From: , fortsetter med
navnet til avsenderen, og til slutt hvorvidt senderen
er online.
• En linje som begynner med To: , og avslutter med
navnet til mottakeren.
• En linje som bare inneholder Message:.
• Meldingsteksten.

From: Odd (online)
To: Even
Message:
Hei, Even! Skal vi ta en kaffe?


Oppgave 1.c) er sammensatt. Her kan det være lurt å først la metoden bare skrive ut navnet
til senderen. Utvid deretter oppførselen til å skrive alt oppgaven ber om. Bruk if for å vise enten
(online) eller (offline).
Det gis poeng for at koden er ryddig og at all koden er kommentert iht. retningslinjer
beskrevet i Appendix J i boken (6. utgave).

2 Sentrale begreper
I readme.txt skal du kort gjøre rede for følgende begreper:
• klasse og objekt,
• felt,
• tilstand.
Forklar også (kort) hvordan du fant navnet til meldingens avsender i receiveMessage-metoden.
