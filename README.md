
# Diagrama-de-classes-iphone-DIO
Desenvolvimento de um diagrama de classe do iphone proposta pela DIO

``` mermaid
classDiagram
    class MusicPlayer {
        +play()
        +pause()
    }

    class iPhoneMusicPlayer {
        +play()
        +pause()
    }

    class Phone {
        +liga()
        +desliga()
        +correioDeVoz()
    }

    class iPhonePhone {
        +liga()
        +desliga()
        +correioDeVoz()
    }

    class InternetBrowser {
        +exibePagina()
        +fechaPagina()
        +addNovaPagina()
        +atualizaPagina()
    }

    class iPhoneInternetBrowser {
        +exibePagina()
        +fechaPagina()
        +addNovaPagina()
        +atualizaPagina()
    }

    MusicPlayer <|-- iPhoneMusicPlayer
    Phone <|-- iPhonePhone
    InternetBrowser <|-- iPhoneInternetBrowser

    interface MusicPlayer
    interface Phone
    interface InternetBrowser

```
