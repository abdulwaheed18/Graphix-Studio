# Graphix Studio - Online Diagram Editor

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Version](https://img.shields.io/badge/Version-1.4.1-blue.svg)](https://github.com/your-username/graphix-studio) [![Built with: HTML, JS, TailwindCSS](https://img.shields.io/badge/Built%20with-HTML%2C%20JS%2C%20TailwindCSS-brightgreen.svg)](#technology-stack)
[![Powered by: Mermaid.js](https://img.shields.io/badge/Powered%20by-Mermaid.js-orange.svg)](https://mermaid.js.org/)

Graphix Studio is an intuitive, web-based diagram editor that allows users to create, visualize, and export a wide variety of diagrams directly from text-based syntax. Leveraging the power of [Mermaid.js](https://mermaid.js.org/), it provides a seamless experience for generating flowcharts, sequence diagrams, class diagrams, Gantt charts, and more, all within your browser.

![Graphix Studio Screenshot](https://placehold.co/800x450/DBEAFE/3B82F6?text=Graphix+Studio+Interface)
*Caption: The intuitive interface of Graphix Studio with the code editor on the left and the rendered diagram on the right.*
*(**Note**: Replace the placeholder image URL above with an actual screenshot of your application, like the one you provided previously, or link to it directly if hosted elsewhere.)*

## Key Features

* **Real-time Rendering:** Instantly visualize diagrams as you type your Mermaid.js code.
* **Auto-Render Option:** Automatically updates the diagram preview at a set interval as you make changes.
* **Multiple Diagram Types:** Supports all diagram types available in Mermaid.js, including:
    * Flowcharts
    * Sequence Diagrams
    * Class Diagrams
    * State Diagrams
    * Gantt Charts
    * Pie Charts
    * ER Diagrams
    * User Journey Diagrams
    * And more...
* **Theme Customization:**
    * Choose from pre-defined themes (Default, Neutral, Dark, Forest).
    * **Advanced Custom Theme Editor:** Fine-tune every aspect of your diagram's appearance, including colors for various elements (background, text, lines, actors, notes), font size, and font family.
* **Responsive Design:** User-friendly interface adaptable to various screen sizes.
* **Resizable Panels:** Adjust the width of the code editor and diagram preview panels.
* **Zoom & Pan:** Easily navigate large and complex diagrams.
* **Fullscreen Mode:** View your diagram in an immersive fullscreen view.
* **Export Options:**
    * **Image Only:** PNG, PDF, SVG.
    * **Image + Code:** Download the diagram image along with its `.graphix` (Mermaid code) file.
* **Code Management:**
    * Import diagram code from `.graphix`, `.txt`, `.mmd`, or `.mermaid` files.
    * Download the current diagram code as a `.graphix` file.
    * Copy diagram code to the clipboard.
* **Image to Clipboard:** Copy the rendered diagram directly to your clipboard as a PNG.
* **Syntax Help & Examples:** Built-in modal with examples for common diagram types.
* **Persistent Settings:** Panel widths and custom theme settings (if implemented with localStorage) can be saved across sessions.
* **Single File Application:** Easy to deploy and run – just open the `index.html` file in a modern web browser.

## Live Demo

[**Try Graphix Studio Live!**](https://your-username.github.io/graphix-studio/)
*(**Note**: Replace this URL with the actual link to your live deployment, e.g., on GitHub Pages.)*

## How to Use

1.  **Open `index.html`:** Download the project files and open `index.html` in your preferred web browser (Chrome, Firefox, Edge, Safari recommended).
2.  **Write Diagram Code:**
    * Enter your [Mermaid.js syntax](https://mermaid.js.org/intro/) in the "Diagram Code" panel on the left.
    * Refer to the "Syntax & Examples" (accessible from the top-left menu) for help.
3.  **Render Diagram:**
    * Click the "Render Diagram" button.
    * Alternatively, enable the "Auto-render" checkbox for live updates.
4.  **Customize Theme:**
    * Use the "Theme" dropdown in the top-left menu.
    * For the "Custom" theme, use the "Primary Custom Color" input or click "Edit Advanced Theme..." for detailed control.
5.  **Interact with Diagram:**
    * Use the zoom buttons or mouse wheel (if implemented) to zoom in/out.
    * Click and drag on the diagram to pan.
    * Toggle fullscreen mode for the diagram panel.
6.  **Export:**
    * Click the "Export Diagram" button in the header to choose your desired format (PNG, PDF, SVG, or image + code).
    * Use the "Copy Image" button in the diagram panel controls to copy the image to your clipboard.
7.  **Manage Code:**
    * Use the "Import Code" or "Download Code" options from the top-left menu.
    * Use the "Copy Code" button above the code editor.

## Technology Stack

* **HTML5:** Structure of the application.
* **Tailwind CSS:** Utility-first CSS framework for styling.
* **JavaScript (ES6+):** Core application logic and interactivity.
* **Mermaid.js:** For parsing text-based diagram definitions and rendering them as SVGs.
* **CodeMirror:** For the syntax-highlighted code editor.
* **jsPDF:** For PDF export functionality.
* **Font Awesome:** For icons.

## Customization

Graphix Studio offers robust theme customization:

* **Pre-built Themes:** Quickly switch between `Default`, `Neutral`, `Dark`, and `Forest` themes.
* **Custom Theme:**
    * **Simple:** Set a primary color directly from the settings dropdown.
    * **Advanced Editor:** Access a comprehensive modal (Settings -> Theme -> Custom -> Edit Advanced Theme...) to modify numerous theme variables such as:
        * `primaryColor`
        * `background`
        * `primaryTextColor`
        * `lineColor`
        * Specific colors for actors, participants, notes, labels, etc.
        * `fontSize`, `fontFamily`
        * And many more specific to different diagram types.
    * Your custom theme settings can be reset to defaults.

## Future Enhancements (Potential)

* Saving and loading custom themes to/from local storage or files.
* More advanced diagram interaction (e.g., node clicking, linking).
* Integration with cloud storage for saving diagrams.
* User accounts and private diagram storage.
* Real-time collaboration features.
* Support for additional diagramming libraries.

## Contributing

Contributions are welcome! If you have suggestions for improvements or want to contribute to the codebase, please feel free to:

1.  Fork the repository.
2.  Create a new branch (`git checkout -b feature/YourAmazingFeature`).
3.  Make your changes.
4.  Commit your changes (`git commit -m 'Add some YourAmazingFeature'`).
5.  Push to the branch (`git push origin feature/YourAmazingFeature`).
6.  Open a Pull Request.

Please ensure your code adheres to the existing style and that any new features are well-documented.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details (or include the MIT license text directly if you don't have a separate file).

---

*This README was generated for Graphix Studio - an advanced online diagramming solution.*
