#include <SFML/Graphics.hpp> // Importation de la bibliothèque SFML

// Création des constantes nécessaires
constexpr int WIDTH = 1280;
constexpr int HEIGHT = 720;

/*
 * Point d'entrée du programme
 */
int main()
{
    // Création d'une fenêtre
    sf::RenderWindow window(sf::VideoMode(WIDTH, HEIGHT), "Tuto");

    // Création des formes
    sf::RectangleShape rectangle(sf::Vector2f(50, 150));
    sf::CircleShape circle(50);

    // Paramétrisation des formes
    rectangle.setPosition(sf::Vector2f(100, 100));
    circle.setOrigin(50, 50);
    circle.setPosition(sf::Vector2f(30, 30));

    rectangle.setFillColor(sf::Color::Green);
    circle.setFillColor(sf::Color::Blue);

    // Boucle d'affichage
    while (window.isOpen())
    {
        // Vérification des évènements
        sf::Event event;
        while (window.pollEvent(event))
        {
            // Traitement de l'évènement de fermeture du programme
            if (event.type == sf::Event::Closed)
            {
                window.close();
            }
        }

        // Effacement de ce qui a été dessiné à l'image d'avant
        window.clear();
        // Dessin des formes
        window.draw(rectangle);
        window.draw(circle);
        // Affichage de l'image dans la fenêtre
        window.display();
    }

    // Fin du programme (return facultatif)
    return 0;
}
