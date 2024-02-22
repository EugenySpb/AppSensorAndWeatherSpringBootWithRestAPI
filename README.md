<div>
  <h1 align="center">
Приложение с использованием Spring Security
</h1>
<h2 align="center">
Описание REST API приложения
</h2>
Это приложение представляет собой REST API для работы с измерениями и датчиками погоды. Пользователи могут отправлять 
измерения и регистрировать новые датчики. API предоставляет возможность получить список измерений, 
количество дней с дождем и другие данные о погоде.
</div>

## Описание классов и методов

### `AppSensorAndWeatherSpringBootWithRestAPIApplication.java`

Основной класс Spring Boot приложения. Запускает приложение и создает бин для использования ModelMapper.

### `MeasurementController.java`

REST контроллер для работы с измерениями.

#### Методы контроллера:

- `add()`: добавляет новое измерение
- `getMeasurement()`: возвращает список всех измерений 
- `getRainyDaysCount()`: возвращает количество дней с дождем

### `SensorController.java`

REST контроллер для работы с датчиками.

#### Методы контроллера:

- `registration()`: регистрирует новый датчик

### `MeasurementDTO.java`

DTO для передачи данных об измерении.

### `MeasurementResponse.java`

Класс-обертка для ответа на запросы списка измерений.

### `PersonDetailsService.java`

Сервис, реализующий интерфейс UserDetailsService Spring Security для загрузки информации о пользователе из репозитория.

### `SensorDTO.java`

DTO для передачи данных о датчике.

### `Measurement.java` и `Sensor.java`

Сущности измерения и датчика.

### `MeasurementRepository.java` и `SensorRepository.java`

Интерфейс репозитория для работы с измерениями и датчиками.

### `MeasurementService.java` и `SensorService.java`

Сервис для работы с измерениями и датчиками.

### `MeasurementValidator.java` и `SensorValidator.java`

Валидатор для проверки корректности данных измерений и датчиков.

### `MeasurementErrorResponse.java`

Класс для создания ответа в случае ошибки.

### `MeasurementException.java`

Исключение, используемое для обработки ошибок валидации.

***
